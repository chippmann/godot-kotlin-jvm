// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Translated to `uniform vec3` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeVec3Parameter : VisualShaderNodeParameter() {
  /**
   * Enables usage of the [defaultValue].
   */
  public final inline var defaultValueEnabled: Boolean
    @JvmName("defaultValueEnabledProperty")
    get() = isDefaultValueEnabled()
    @JvmName("defaultValueEnabledProperty")
    set(`value`) {
      setDefaultValueEnabled(value)
    }

  /**
   * A default value to be assigned within the shader.
   */
  @CoreTypeLocalCopy
  public final inline var defaultValue: Vector3
    @JvmName("defaultValueProperty")
    get() = getDefaultValue()
    @JvmName("defaultValueProperty")
    set(`value`) {
      setDefaultValue(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(828, scriptIndex)
  }

  /**
   * A default value to be assigned within the shader.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = visualshadernodevec3parameter.defaultValue
   * //Your changes
   * visualshadernodevec3parameter.defaultValue = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun defaultValueMutate(block: Vector3.() -> Unit): Vector3 = defaultValue.apply{
      block(this)
      defaultValue = this
  }


  public final fun setDefaultValueEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValueEnabledPtr, NIL)
  }

  public final fun isDefaultValueEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDefaultValueEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDefaultValue(`value`: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to value)
    TransferContext.callMethod(ptr, MethodBindings.setDefaultValuePtr, NIL)
  }

  public final fun getDefaultValue(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDefaultValuePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public companion object

  public object MethodBindings {
    internal val setDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec3Parameter", "set_default_value_enabled", 2586408642)

    internal val isDefaultValueEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec3Parameter", "is_default_value_enabled", 36873697)

    internal val setDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec3Parameter", "set_default_value", 3460891852)

    internal val getDefaultValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeVec3Parameter", "get_default_value", 3360562783)
  }
}
