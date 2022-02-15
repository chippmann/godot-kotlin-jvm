// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A syntax highlighter for code.
 *
 * A syntax highlighter for code.
 */
@GodotBaseType
public open class CodeHighlighter : SyntaxHighlighter() {
  /**
   * Sets the color for numbers.
   */
  public open var numberColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_NUMBER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_NUMBER_COLOR,
          NIL)
    }

  /**
   * Sets the color for symbols.
   */
  public open var symbolColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_SYMBOL_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_SYMBOL_COLOR,
          NIL)
    }

  /**
   * Sets color for functions. A function is a non-keyword string followed by a '('.
   */
  public open var functionColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_FUNCTION_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_FUNCTION_COLOR, NIL)
    }

  /**
   * Sets color for member variables. A member variable is non-keyword, non-function string proceeded with a '.'.
   */
  public open var memberVariableColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_MEMBER_VARIABLE_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_MEMBER_VARIABLE_COLOR, NIL)
    }

  /**
   * Sets the keyword colors. All existing keywords will be removed. The [godot.core.Dictionary] key is the keyword. The value is the keyword color.
   */
  public open var keywordColors: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_KEYWORD_COLORS, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_KEYWORD_COLORS, NIL)
    }

  /**
   * Sets the member keyword colors. All existing member keyword will be removed. The [godot.core.Dictionary] key is the member keyword. The value is the member keyword color.
   */
  public open var memberKeywordColors: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_MEMBER_KEYWORD_COLORS, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_MEMBER_KEYWORD_COLORS, NIL)
    }

  /**
   * Sets the color regions. All existing regions will be removed. The [godot.core.Dictionary] key is the region start and end key, separated by a space. The value is the region color.
   */
  public open var colorRegions: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_COLOR_REGIONS,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_SET_COLOR_REGIONS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CODEHIGHLIGHTER)
  }

  /**
   * Sets the color for a keyword.
   *
   * The keyword cannot contain any symbols except '_'.
   */
  public open fun addKeywordColor(keyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to keyword, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_ADD_KEYWORD_COLOR,
        NIL)
  }

  /**
   * Removes the keyword.
   */
  public open fun removeKeywordColor(keyword: String): Unit {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_REMOVE_KEYWORD_COLOR, NIL)
  }

  /**
   * Returns `true` if the keyword exists, else `false`.
   */
  public open fun hasKeywordColor(keyword: String): Boolean {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_HAS_KEYWORD_COLOR,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the color for a keyword.
   */
  public open fun getKeywordColor(keyword: String): Color {
    TransferContext.writeArguments(STRING to keyword)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_KEYWORD_COLOR,
        COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Removes all keywords.
   */
  public open fun clearKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_CLEAR_KEYWORD_COLORS, NIL)
  }

  /**
   * Sets the color for a member keyword.
   *
   * The member keyword cannot contain any symbols except '_'.
   *
   * It will not be highlighted if preceded by a '.'.
   */
  public open fun addMemberKeywordColor(memberKeyword: String, color: Color): Unit {
    TransferContext.writeArguments(STRING to memberKeyword, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_ADD_MEMBER_KEYWORD_COLOR, NIL)
  }

  /**
   * Removes the member keyword.
   */
  public open fun removeMemberKeywordColor(memberKeyword: String): Unit {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_REMOVE_MEMBER_KEYWORD_COLOR, NIL)
  }

  /**
   * Returns `true` if the member keyword exists, else `false`.
   */
  public open fun hasMemberKeywordColor(memberKeyword: String): Boolean {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_HAS_MEMBER_KEYWORD_COLOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the color for a member keyword.
   */
  public open fun getMemberKeywordColor(memberKeyword: String): Color {
    TransferContext.writeArguments(STRING to memberKeyword)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_GET_MEMBER_KEYWORD_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Removes all member keywords.
   */
  public open fun clearMemberKeywordColors(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_CLEAR_MEMBER_KEYWORD_COLORS, NIL)
  }

  /**
   * Adds a color region such as comments or strings.
   *
   * Both the start and end keys must be symbols. Only the start key has to be unique.
   *
   * Line only denotes if the region should continue until the end of the line or carry over on to the next line. If the end key is blank this is automatically set to `true`.
   */
  public open fun addColorRegion(
    startKey: String,
    endKey: String,
    color: Color,
    lineOnly: Boolean = false
  ): Unit {
    TransferContext.writeArguments(STRING to startKey, STRING to endKey, COLOR to color, BOOL to
        lineOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_ADD_COLOR_REGION,
        NIL)
  }

  /**
   * Removes the color region that uses that start key.
   */
  public open fun removeColorRegion(startKey: String): Unit {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_REMOVE_COLOR_REGION,
        NIL)
  }

  /**
   * Returns `true` if the start key exists, else `false`.
   */
  public open fun hasColorRegion(startKey: String): Boolean {
    TransferContext.writeArguments(STRING to startKey)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_HAS_COLOR_REGION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes all color regions.
   */
  public open fun clearColorRegions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CODEHIGHLIGHTER_CLEAR_COLOR_REGIONS,
        NIL)
  }

  public companion object
}