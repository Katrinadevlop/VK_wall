package ru.netology

sealed class Attachment {
    abstract var type: String
}

data class AttachmentPhoto(
    override var type: String = "Photo",
    val id: Int = 0,
    val album_id: Int = 0,
    val owner_id: Int = 0,
    val user_id: Int? = 0,
    val text: String? = "",
    val date: Int = 0,
    val thumb_hash: String? = "",
    val has_tags: Boolean? = false,
    val width: Int = 0,
    val height: Int = 0
) : Attachment()

data class AttachmentVideo(
    override var type: String = "Video",
    val id: Int = 0,
    val owner_id: Int = 0,
    val title: String = "",
    val description: String = "",
    val duration: Int = 0,
    val date: Int = 0
) : Attachment()

data class AttachmentAudio(
    override var type: String = "Audio",
    val id: Int = 0,
    val owner_id: Int = 0,
    val artist: String = "",
    val title: String = "",
    val duration: Int = 0,
    val url: String? = "",
    val lyrics_id: Int? = 0,
    val album_id: Int? = 0,
    val genre_id: Int? = 0,
    val date: Int = 0,
    val no_search: Int? = 0,
    val is_hq: Int? = 0
) : Attachment()