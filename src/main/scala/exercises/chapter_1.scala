// effects may occur, but they shouldn't be observable
// ex: mutate data declared locally in the body of a function, if we ensure
// it can't be referenced outside that function

// pure function -> lack of side effects

// `e` is referential transparent -> if for all programs `p` all occurrencies of
// `e` in `p` can be replaed by the result of evaluating `e` without affecting the
// meaning of `p`

// `f` is pure if the expression `f(x)` is referentially transparent for all
// referentially transparent `x`

// equational reasoning is enabled by referential transparency

// "Understanding requires only local reasoning"

// organising modules with these properties means having a program that is easier
// to understand and reuse
// meaning of a program = meaning of the components and rules governing their
// interactions

// val -> immutable variable

// procedure -> side effects
