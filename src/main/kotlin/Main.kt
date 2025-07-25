package ru.netology

fun main() {
    val attachmentAudio = AttachmentAudio(date = 4)
    val attachmentVideo = AttachmentVideo(date = 5)
    val attachmentPhoto = AttachmentPhoto(date = 6)
    val array = arrayOf(attachmentAudio, attachmentPhoto, attachmentVideo)

    val post = Post(
        id = 1,
        owner_id = 1,
        from_id = 1,
        created_by = 1,
        date = 20250725,
        text = "Привет!",
        reply_owner_id = 0,
        reply_post_id = 0,
        friends_only = false,
        arrayAttachment = array
    )
    println(WallService.add(post))
    post.text = "Hello!"
    println(WallService.update(post))
    println(post)

    WallService.clear()
    println(WallService.add(post))
    println(WallService.add(post))
    println(WallService.add(post))
}

