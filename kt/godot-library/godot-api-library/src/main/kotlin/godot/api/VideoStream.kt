// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Base resource type for all video streams. Classes that derive from [VideoStream] can all be used
 * as resource types to play back videos in [VideoStreamPlayer].
 */
@GodotBaseType
public open class VideoStream : Resource() {
  /**
   * The video file path or URI that this [VideoStream] resource handles.
   * For [VideoStreamTheora], this filename should be an Ogg Theora video file with the `.ogv`
   * extension.
   */
  public final inline var `file`: String
    @JvmName("fileProperty")
    get() = getFile()
    @JvmName("fileProperty")
    set(`value`) {
      setFile(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(717, scriptIndex)
  }

  /**
   * Called when the video starts playing, to initialize and return a subclass of
   * [VideoStreamPlayback].
   */
  public open fun _instantiatePlayback(): VideoStreamPlayback? {
    throw NotImplementedError("_instantiate_playback is not implemented for VideoStream")
  }

  public final fun setFile(`file`: String): Unit {
    TransferContext.writeArguments(STRING to file)
    TransferContext.callMethod(ptr, MethodBindings.setFilePtr, NIL)
  }

  public final fun getFile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val setFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStream", "set_file", 83702148)

    internal val getFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VideoStream", "get_file", 2841200299)
  }
}
