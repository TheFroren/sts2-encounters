package com.froren

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform