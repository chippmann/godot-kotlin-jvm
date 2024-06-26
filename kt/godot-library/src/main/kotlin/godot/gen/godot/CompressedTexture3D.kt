// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Texture with 3 dimensions, optionally compressed.
 *
 * [godot.CompressedTexture3D] is the VRAM-compressed counterpart of [godot.ImageTexture3D]. The file extension for [godot.CompressedTexture3D] files is `.ctex3d`. This file format is internal to Godot; it is created by importing other image formats with the import system.
 *
 * [godot.CompressedTexture3D] uses VRAM compression, which allows to reduce memory usage on the GPU when rendering the texture. This also improves loading times, as VRAM-compressed textures are faster to load compared to textures using lossless compression. VRAM compression can exhibit noticeable artifacts and is intended to be used for 3D rendering, not 2D.
 *
 * See [godot.Texture3D] for a general description of 3D textures.
 */
@GodotBaseType
public open class CompressedTexture3D : Texture3D() {
  /**
   * The [godot.CompressedTexture3D]'s file path to a `.ctex3d` file.
   */
  public val loadPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLoadPathPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COMPRESSEDTEXTURE3D, scriptIndex)
    return true
  }

  /**
   * Loads the texture from the specified [path].
   */
  public fun load(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, MethodBindings.loadPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val loadPtr: VoidPtr = TypeManager.getMethodBindPtr("CompressedTexture3D", "load")

    public val getLoadPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CompressedTexture3D", "get_load_path")
  }
}
