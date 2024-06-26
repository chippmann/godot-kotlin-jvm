// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides playback control for an [godot.AnimationNodeStateMachine].
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * Allows control of [godot.AnimationTree] state machines created with [godot.AnimationNodeStateMachine]. Retrieve with `$AnimationTree.get("parameters/playback")`.
 *
 * **Example:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var state_machine = $AnimationTree.get("parameters/playback")
 *
 * state_machine.travel("some_state")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var stateMachine = GetNode<AnimationTree>("AnimationTree").Get("parameters/playback").As<AnimationNodeStateMachinePlayback>();
 *
 * stateMachine.Travel("some_state");
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class AnimationNodeStateMachinePlayback : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK, scriptIndex)
    return true
  }

  /**
   * Transitions from the current state to another one, following the shortest path.
   *
   * If the path does not connect from the current state, the animation will play after the state teleports.
   *
   * If [resetOnTeleport] is `true`, the animation is played from the beginning when the travel cause a teleportation.
   */
  @JvmOverloads
  public fun travel(toNode: StringName, resetOnTeleport: Boolean = true): Unit {
    TransferContext.writeArguments(STRING_NAME to toNode, BOOL to resetOnTeleport)
    TransferContext.callMethod(rawPtr, MethodBindings.travelPtr, NIL)
  }

  /**
   * Starts playing the given animation.
   *
   * If [reset] is `true`, the animation is played from the beginning.
   */
  @JvmOverloads
  public fun start(node: StringName, reset: Boolean = true): Unit {
    TransferContext.writeArguments(STRING_NAME to node, BOOL to reset)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * If there is a next path by travel or auto advance, immediately transitions from the current state to the next state.
   */
  public fun next(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.nextPtr, NIL)
  }

  /**
   * Stops the currently playing animation.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  /**
   * Returns `true` if an animation is playing.
   */
  public fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isPlayingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the currently playing animation state.
   *
   * **Note:** When using a cross-fade, the current state changes to the next state immediately after the cross-fade begins.
   */
  public fun getCurrentNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the playback position within the current animation state.
   */
  public fun getCurrentPlayPosition(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentPlayPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the current state length.
   *
   * **Note:** It is possible that any [godot.AnimationRootNode] can be nodes as well as animations. This means that there can be multiple animations within a single state. Which animation length has priority depends on the nodes connected inside it. Also, if a transition does not reset, the remaining length at that point will be returned.
   */
  public fun getCurrentLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the starting state of currently fading animation.
   */
  public fun getFadingFromNode(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFadingFromNodePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the current travel path as computed internally by the A* algorithm.
   */
  public fun getTravelPath(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPathPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<StringName>)
  }

  public companion object

  internal object MethodBindings {
    public val travelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "travel")

    public val startPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "start")

    public val nextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "next")

    public val stopPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "stop")

    public val isPlayingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "is_playing")

    public val getCurrentNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_node")

    public val getCurrentPlayPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_play_position")

    public val getCurrentLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_current_length")

    public val getFadingFromNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_fading_from_node")

    public val getTravelPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeStateMachinePlayback", "get_travel_path")
  }
}
