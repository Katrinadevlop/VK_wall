package ru.netology

data class Post(
    var id: Int,
    var owner_id: Int,
    var from_id: Int,
    var created_by: Int,
    var date: Int,
    var text: String,
    var reply_owner_id: Int,
    var reply_post_id: Int,
    var friends_only: Boolean,
    var comments: Comments = Comments,
    var copyright: Copyright = Copyright,
    var likes: Likes = Likes,
    var reposts: Reposts = Reposts,
    var views: Views = Views,
    var post_type: String = "",
    var post_source: PostSource? = null,
    var geo: Geo? = null,
    var signer_id: Int? = null,
    var copy_history: List<Post> = emptyList(),
    var can_pin: Int = 0,
    var can_delete: Int = 0,
    var can_edit: Int = 0,
    var is_pinned: Int = 0,
    var marked_as_ads: Int = 0,
    var is_favorite: Boolean = false,
    var donut: Donut? = null,
    var postponed_id: Int? = null
) {
}

object Comments {
    val count: Int = 0
    val can_post: Int = 1
    val groups_can_post: Boolean = true
    val can_close: Boolean = false
    val can_open: Boolean = true
}

object Copyright {
    val id: Int = 0
    val link: String = ""
    val name: String = ""
    val type: String = ""
}

object Likes {
    val count: Int = 0
    val user_likes: Int = 0
    val can_like: Int = 0
    val can_publish: Int = 0
}

object Reposts {
    val count: Int = 0
    val user_reposted: Int = 0
}

object Views {
    val count: Int = 0
}

object PostSource {
    val type: String = ""
    val platform: String? = null
    val data: String? = null
    val url: String? = null
}

object Geo {
    val type: String = ""
    val coordinates: String = ""
    val place: Place? = null
}

object Place {
    val id: Int = 0
    val title: String = ""
    val latitude: Double = 0.0
    val longitude: Double = 0.0
    val created: Int = 0
    val icon: String = ""
    val country: String = ""
    val city: String = ""
    val type: Int = 0
}

object Donut {
    val is_donut: Boolean = false
    val paid_duration: Int = 0
    val can_publish_free_copy: Boolean = false
    val edit_mode: String = ""
}

object WallService {
    private var posts = emptyArray<Post>()
    private var idAllPost = 1

    fun add(post: Post): Post {
        val postNew = post.copy(id = idAllPost++)
        posts += postNew
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        idAllPost = 0
    }
}

