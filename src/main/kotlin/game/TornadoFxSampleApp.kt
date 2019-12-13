package game

import tornadofx.App
import tornadofx.Stylesheet
import tornadofx.View
import tornadofx.action
import tornadofx.box
import tornadofx.button
import tornadofx.cssclass
import tornadofx.field
import tornadofx.fieldset
import tornadofx.form
import tornadofx.hbox
import tornadofx.launch
import tornadofx.px
import tornadofx.textfield

fun main(args: Array<String>) {
    launch<TornadoFxSampleApp>(args)
}

class TornadoFxSampleApp : App(HelloWorld::class, Styles::class)

class Styles : Stylesheet() {

    init {
        s(form) {
            padding = box(25.px)
            prefWidth = 450.px

            s(zip) {
                maxWidth = 60.px
                minWidth = maxWidth
            }
        }
    }

    companion object {
        val zip by cssclass()
    }
}

class HelloWorld : View() {
    override val root = hbox {
        form {
            fieldset("Personal Information") {
                field("Name") {
                    textfield("Name")
                }

                field("Birthday") {
                    textfield("Birthday")
                }
            }

            fieldset("Address") {
                field("Street") {
                    textfield("Street")
                }
                field("Zip / City") {
                    textfield("Zip")
                    textfield("City")
                }
            }

            button("Save") {
                action {
                    println("Saved")
                }
            }
        }
    }
}
