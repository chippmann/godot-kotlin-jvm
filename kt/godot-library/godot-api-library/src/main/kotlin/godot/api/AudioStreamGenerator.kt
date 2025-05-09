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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [AudioStreamGenerator] is a type of audio stream that does not play back sounds on its own;
 * instead, it expects a script to generate audio data for it. See also [AudioStreamGeneratorPlayback].
 * Here's a sample on how to use it to generate a sine wave:
 *
 * gdscript:
 * ```gdscript
 * var playback # Will hold the AudioStreamGeneratorPlayback.
 * @onready var sample_hz = $AudioStreamPlayer.stream.mix_rate
 * var pulse_hz = 440.0 # The frequency of the sound wave.
 * var phase = 0.0
 *
 * func _ready():
 *     $AudioStreamPlayer.play()
 *     playback = $AudioStreamPlayer.get_stream_playback()
 *     fill_buffer()
 *
 * func fill_buffer():
 *     var increment = pulse_hz / sample_hz
 *     var frames_available = playback.get_frames_available()
 *
 *     for i in range(frames_available):
 *         playback.push_frame(Vector2.ONE * sin(phase * TAU))
 *         phase = fmod(phase + increment, 1.0)
 * ```
 * csharp:
 * ```csharp
 * [Export] public AudioStreamPlayer Player { get; set; }
 *
 * private AudioStreamGeneratorPlayback _playback; // Will hold the AudioStreamGeneratorPlayback.
 * private float _sampleHz;
 * private float _pulseHz = 440.0f; // The frequency of the sound wave.
 * private double phase = 0.0;
 *
 * public override void _Ready()
 * {
 *     if (Player.Stream is AudioStreamGenerator generator) // Type as a generator to access
 * MixRate.
 *     {
 *         _sampleHz = generator.MixRate;
 *         Player.Play();
 *         _playback = (AudioStreamGeneratorPlayback)Player.GetStreamPlayback();
 *         FillBuffer();
 *     }
 * }
 *
 * public void FillBuffer()
 * {
 *     float increment = _pulseHz / _sampleHz;
 *     int framesAvailable = _playback.GetFramesAvailable();
 *
 *     for (int i = 0; i < framesAvailable; i++)
 *     {
 *         _playback.PushFrame(Vector2.One * (float)Mathf.Sin(phase * Mathf.Tau));
 *         phase = Mathf.PosMod(phase + increment, 1.0);
 *     }
 * }
 * ```
 *
 * In the example above, the "AudioStreamPlayer" node must use an [AudioStreamGenerator] as its
 * stream. The `fill_buffer` function provides audio data for approximating a sine wave.
 * See also [AudioEffectSpectrumAnalyzer] for performing real-time audio spectrum analysis.
 * **Note:** Due to performance constraints, this class is best used from C# or from a compiled
 * language via GDExtension. If you still want to use this class from GDScript, consider using a lower
 * [mixRate] such as 11,025 Hz or 22,050 Hz.
 */
@GodotBaseType
public open class AudioStreamGenerator : AudioStream() {
  /**
   * Mixing rate mode. If set to [MIX_RATE_CUSTOM], [mixRate] is used, otherwise current
   * [AudioServer] mixing rate is used.
   */
  public final inline var mixRateMode: AudioStreamGeneratorMixRate
    @JvmName("mixRateModeProperty")
    get() = getMixRateMode()
    @JvmName("mixRateModeProperty")
    set(`value`) {
      setMixRateMode(value)
    }

  /**
   * The sample rate to use (in Hz). Higher values are more demanding for the CPU to generate, but
   * result in better quality.
   * In games, common sample rates in use are `11025`, `16000`, `22050`, `32000`, `44100`, and
   * `48000`.
   * According to the
   * [url=https://en.wikipedia.org/wiki/Nyquist&#37;E2&#37;80&#37;93Shannon_sampling_theorem]Nyquist-Shannon
   * sampling theorem[/url], there is no quality difference to human hearing when going past 40,000 Hz
   * (since most humans can only hear up to ~20,000 Hz, often less). If you are generating
   * lower-pitched sounds such as voices, lower sample rates such as `32000` or `22050` may be usable
   * with no loss in quality.
   * **Note:** [AudioStreamGenerator] is not automatically resampling input data, to produce
   * expected result [mixRateMode] should match the sampling rate of input data.
   * **Note:** If you are using [AudioEffectCapture] as the source of your data, set [mixRateMode]
   * to [MIX_RATE_INPUT] or [MIX_RATE_OUTPUT] to automatically match current [AudioServer] mixing rate.
   */
  public final inline var mixRate: Float
    @JvmName("mixRateProperty")
    get() = getMixRate()
    @JvmName("mixRateProperty")
    set(`value`) {
      setMixRate(value)
    }

  /**
   * The length of the buffer to generate (in seconds). Lower values result in less latency, but
   * require the script to generate audio data faster, resulting in increased CPU usage and more risk
   * for audio cracking if the CPU can't keep up.
   */
  public final inline var bufferLength: Float
    @JvmName("bufferLengthProperty")
    get() = getBufferLength()
    @JvmName("bufferLengthProperty")
    set(`value`) {
      setBufferLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(116, scriptIndex)
  }

  public final fun setMixRate(hz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to hz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMixRatePtr, NIL)
  }

  public final fun getMixRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMixRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMixRateMode(mode: AudioStreamGeneratorMixRate): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setMixRateModePtr, NIL)
  }

  public final fun getMixRateMode(): AudioStreamGeneratorMixRate {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMixRateModePtr, LONG)
    return AudioStreamGenerator.AudioStreamGeneratorMixRate.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setBufferLength(seconds: Float): Unit {
    TransferContext.writeArguments(DOUBLE to seconds.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBufferLengthPtr, NIL)
  }

  public final fun getBufferLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class AudioStreamGeneratorMixRate(
    id: Long,
  ) {
    /**
     * Current [AudioServer] output mixing rate.
     */
    MIX_RATE_OUTPUT(0),
    /**
     * Current [AudioServer] input mixing rate.
     */
    MIX_RATE_INPUT(1),
    /**
     * Custom mixing rate, specified by [mixRate].
     */
    MIX_RATE_CUSTOM(2),
    /**
     * Maximum value for the mixing rate mode enum.
     */
    MIX_RATE_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AudioStreamGeneratorMixRate =
          entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "set_mix_rate", 373806689)

    internal val getMixRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "get_mix_rate", 1740695150)

    internal val setMixRateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "set_mix_rate_mode", 3354885803)

    internal val getMixRateModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "get_mix_rate_mode", 3537132591)

    internal val setBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "set_buffer_length", 373806689)

    internal val getBufferLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioStreamGenerator", "get_buffer_length", 1740695150)
  }
}
