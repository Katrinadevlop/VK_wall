import org.junit.jupiter.api.Test
import ru.netology.Post
import ru.netology.WallService
import kotlin.test.assertEquals

class WallServiceTest {
    @Test
    fun add() {
        val post = Post(
            id = 1,
            owner_id = 1,
            from_id = 1,
            created_by = 1,
            date = 20250725,
            text = "Привет!",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false
        )

        val result = WallService.add(post)
        assertEquals(1, result.id)
    }

    @Test
    fun update() {
        val post = Post(
            id = 1,
            owner_id = 1,
            from_id = 1,
            created_by = 1,
            date = 20250725,
            text = "Привет!",
            reply_owner_id = 0,
            reply_post_id = 0,
            friends_only = false
        )
        WallService.add(post)

        var result = WallService.update(post)
        assertEquals(true, result)

        val nonExistingPost = post.copy(id = 90)
        result = WallService.update(nonExistingPost)
        assertEquals(false, result)
    }
}


