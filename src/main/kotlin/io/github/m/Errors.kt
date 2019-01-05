package io.github.m

/**
 * M error definitions.
 */
@Suppress("unused")
object Errors {
    @MField("error")
    @JvmField
    val error: Value = Function { arg -> throw Error(List.from(arg).toString) }
}