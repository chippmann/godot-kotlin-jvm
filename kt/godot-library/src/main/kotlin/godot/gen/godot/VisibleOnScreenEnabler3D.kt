// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Enables certain nodes only when approximately visible.
 *
 * The VisibleOnScreenEnabler3D will disable [godot.RigidDynamicBody3D] and [godot.AnimationPlayer] nodes when they are not visible. It will only affect other nodes within the same scene as the VisibleOnScreenEnabler3D itself.
 *
 * If you just want to receive notifications, use [godot.VisibleOnScreenNotifier3D] instead.
 *
 * **Note:** VisibleOnScreenEnabler3D uses an approximate heuristic for performance reasons. It doesn't take walls and other occlusion into account. The heuristic is an implementation detail and may change in future versions. If you need precise visibility checking, use another method such as adding an [godot.Area3D] node as a child of a [godot.Camera3D] node and/or [godot.Vector3.dot].
 *
 * **Note:** VisibleOnScreenEnabler3D will not affect nodes added after scene initialization.
 */
@GodotBaseType
public open class VisibleOnScreenEnabler3D : VisibleOnScreenNotifier3D() {
  /**
   *
   */
  public open var enableMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER3D_GET_ENABLE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER3D_SET_ENABLE_MODE, NIL)
    }

  /**
   *
   */
  public open var enableNodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER3D_GET_ENABLE_NODE_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISIBLEONSCREENENABLER3D_SET_ENABLE_NODE_PATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER3D)
  }

  public enum class EnableMode(
    id: Long
  ) {
    /**
     *
     */
    ENABLE_MODE_INHERIT(0),
    /**
     *
     */
    ENABLE_MODE_ALWAYS(1),
    /**
     *
     */
    ENABLE_MODE_WHEN_PAUSED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}