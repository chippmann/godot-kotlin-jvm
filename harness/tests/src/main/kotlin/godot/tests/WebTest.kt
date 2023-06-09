package godot.tests

import godot.Control
import godot.Label
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.*
import godot.extensions.getNodeAs

@RegisterClass
class WebTest : Control() {
    private var count = 0
    @RegisterFunction
    fun onClick() {
        count++
        getNodeAs<Label>("VBoxContainer/Label2")?.text = "Count: $count"
    }
}
