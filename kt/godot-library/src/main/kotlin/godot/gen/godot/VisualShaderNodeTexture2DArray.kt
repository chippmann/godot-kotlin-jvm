// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A 2D texture uniform array to be used within the visual shader graph.
 *
 * Translated to `uniform sampler2DArray` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeTexture2DArray : VisualShaderNodeSample3D() {
  /**
   * A source texture array. Used if [godot.VisualShaderNodeSample3D.source] is set to [godot.VisualShaderNodeSample3D.SOURCE_TEXTURE].
   */
  public var textureArray: Texture2DArray?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextureArrayPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2DArray?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextureArrayPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE2DARRAY, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "set_texture_array")

    public val getTextureArrayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture2DArray", "get_texture_array")
  }
}
