package com.polygonalproductuion.utils

sealed class Either<out L, out R> {
    data class Left<out L, out R>(val l: L) : Either<L, R>()

    data class Right<out L, out R>(val r: R) : Either<L, R>()
}

fun <E> E.left() = Either.Left<E, Nothing>(this)

fun <T> T.right() = Either.Right<Nothing, T>(this)