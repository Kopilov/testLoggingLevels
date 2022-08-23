package org.logging.demo

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.io.readArrowFeather
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File


private val logger: Logger = LoggerFactory.getLogger("org.logging.demo.MainKt")

fun main() {
    val df = DataFrame.readArrowFeather(File("test.arrow.feather"))

    logger.info("Dataframe with ${df.rowsCount()} rows and ${df.columnsCount()} columns ")

    logger.trace("Got dataframe:\n$df")
}
