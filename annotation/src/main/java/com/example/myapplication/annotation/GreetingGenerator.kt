package com.example.myapplication.annotation

/**
 * Custom Annotation class
 * For more information check - "https://kotlinlang.org/docs/reference/annotations.html"
 */

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class GreetingGenerator