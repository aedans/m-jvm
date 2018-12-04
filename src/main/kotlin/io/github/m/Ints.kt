package io.github.m

/**
 * M int definitions.
 */
@Suppress("unused")
object Ints {
    @MField("int.+")
    @JvmField
    val add: Value = Function { x, y -> Int((x as Int).value + (y as Int).value) }

    @MField("int.-")
    @JvmField
    val sub: Value = Function { x, y -> Int((x as Int).value - (y as Int).value) }

    @MField("int.*")
    @JvmField
    val mul: Value = Function { x, y -> Int((x as Int).value * (y as Int).value) }

    @MField("int./")
    @JvmField
    val div: Value = Function { x, y -> Int((x as Int).value / (y as Int).value) }

    @MField("int.%")
    @JvmField
    val rem: Value = Function { x, y -> Int((x as Int).value % (y as Int).value) }

    @MField("int.<")
    @JvmField
    val lt: Value = Function { x, y -> Bool((x as Int).value < (y as Int).value) }

    @MField("int.>")
    @JvmField
    val gt: Value = Function { x, y -> Bool((x as Int).value > (y as Int).value) }

    @MField("int.=")
    @JvmField
    val eq: Value = Function { x, y -> Bool((x as Int).value == (y as Int).value) }

    @MField("int->char")
    @JvmField
    val toChar: Value = Function { x -> Char((x as Int).value.toChar()) }
}