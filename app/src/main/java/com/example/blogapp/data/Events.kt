package com.example.blogapp.data

open class Event<out T>(private val content: T) {
    var hasBeenHandled = false
        private set

    /**
     * Returns the content of the event if it has not been handled yet, or null if it has been handled.
     *
     * @return the content of the event or null.
     */
    fun getContentOrNull(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }
}