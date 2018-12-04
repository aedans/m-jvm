package io.github.m

/**
 * M nat definitions.
 */
@Suppress("unused")
@ExperimentalUnsignedTypes
object Nats {
    @MField("nat.+")
    @JvmField
    val add: Value = Function { x, y -> Nat((x as Nat).value + (y as Nat).value) }

    @MField("nat.-")
    @JvmField
    val sub: Value = Function { x, y -> Nat((x as Nat).value - (y as Nat).value) }

    @MField("nat.*")
    @JvmField
    val mul: Value = Function { x, y -> Nat((x as Nat).value * (y as Nat).value) }

    @MField("nat./")
    @JvmField
    val div: Value = Function { x, y -> Nat((x as Nat).value / (y as Nat).value) }

    @MField("nat.%")
    @JvmField
    val rem: Value = Function { x, y -> Nat((x as Nat).value % (y as Nat).value) }

    @MField("nat.<")
    @JvmField
    val lt: Value = Function { x, y -> Bool((x as Nat).value < (y as Nat).value) }

    @MField("nat.>")
    @JvmField
    val gt: Value = Function { x, y -> Bool((x as Nat).value > (y as Nat).value) }

    @MField("nat.=")
    @JvmField
    val eq: Value = Function { x, y -> Bool((x as Nat).value == (y as Nat).value) }

    @MField("nat->char")
    @JvmField
    val toChar: Value = Function { x -> Char((x as Nat).value.toInt().toChar()) }
}