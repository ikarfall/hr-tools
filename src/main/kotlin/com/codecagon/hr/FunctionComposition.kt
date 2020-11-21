package com.codecagon.hr

infix fun <T : Any, U : Any> T.then(func: (T) -> U): U = func(this)
