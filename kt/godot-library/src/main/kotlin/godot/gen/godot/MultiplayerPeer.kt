// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Abstract class for specialized [godot.PacketPeer]s used by the [godot.MultiplayerAPI].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/537](https://godotengine.org/asset-library/asset/537)
 *
 * Manages the connection with one or more remote peers acting as server or client and assigning unique IDs to each of them. See also [godot.MultiplayerAPI].
 *
 * **Note:** The [godot.MultiplayerAPI] protocol is an implementation detail and isn't meant to be used by non-Godot servers. It may change without notice.
 *
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android export preset before exporting the project or using one-click deploy. Otherwise, network communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class MultiplayerPeer internal constructor() : PacketPeer() {
  /**
   * Emitted when a remote peer connects.
   */
  public val peerConnected: Signal1<Long> by signal("id")

  /**
   * Emitted when a remote peer has disconnected.
   */
  public val peerDisconnected: Signal1<Long> by signal("id")

  /**
   * If `true`, this [godot.MultiplayerPeer] refuses new connections.
   */
  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRefusingNewConnectionsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRefuseNewConnectionsPtr, NIL)
    }

  /**
   * The manner in which to send packets to the target peer. See [enum TransferMode], and the [setTargetPeer] method.
   */
  public var transferMode: TransferMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransferModePtr, LONG)
      return MultiplayerPeer.TransferMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransferModePtr, NIL)
    }

  /**
   * The channel to use to send packets. Many network APIs such as ENet and WebRTC allow the creation of multiple independent channels which behaves, in a way, like separate connections. This means that reliable data will only block delivery of other packets on that channel, and ordering will only be in respect to the channel the packet is being sent on. Using different channels to send **different and independent** state updates is a common way to optimize network usage and decrease latency in fast-paced games.
   *
   * **Note:** The default channel (`0`) actually works as 3 separate channels (one for each [enum TransferMode]) so that [TRANSFER_MODE_RELIABLE] and [TRANSFER_MODE_UNRELIABLE_ORDERED] does not interact with each other by default. Refer to the specific network API documentation (e.g. ENet or WebRTC) to learn how to set up channels correctly.
   */
  public var transferChannel: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransferChannelPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTransferChannelPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEER, scriptIndex)
    return true
  }

  /**
   * Sets the peer to which packets will be sent.
   *
   * The [id] can be one of: [TARGET_PEER_BROADCAST] to send to all connected peers, [TARGET_PEER_SERVER] to send to the peer acting as server, a valid peer ID to send to that specific peer, a negative peer ID to send to all peers except that one. By default, the target peer is [TARGET_PEER_BROADCAST].
   */
  public fun setTargetPeer(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetPeerPtr, NIL)
  }

  /**
   * Returns the ID of the [godot.MultiplayerPeer] who sent the next available packet. See [godot.PacketPeer.getAvailablePacketCount].
   */
  public fun getPacketPeer(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketPeerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the channel over which the next available packet was received. See [godot.PacketPeer.getAvailablePacketCount].
   */
  public fun getPacketChannel(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketChannelPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [enum MultiplayerPeer.TransferMode] the remote peer used to send the next available packet. See [godot.PacketPeer.getAvailablePacketCount].
   */
  public fun getPacketMode(): TransferMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPacketModePtr, LONG)
    return MultiplayerPeer.TransferMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Waits up to 1 second to receive a new network event.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  /**
   * Immediately close the multiplayer peer returning to the state [CONNECTION_DISCONNECTED]. Connected peers will be dropped without emitting [peerDisconnected].
   */
  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  /**
   * Disconnects the given [peer] from this host. If [force] is `true` the [peerDisconnected] signal will not be emitted for this peer.
   */
  @JvmOverloads
  public fun disconnectPeer(peer: Int, force: Boolean = false): Unit {
    TransferContext.writeArguments(LONG to peer.toLong(), BOOL to force)
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPeerPtr, NIL)
  }

  /**
   * Returns the current state of the connection. See [enum ConnectionStatus].
   */
  public fun getConnectionStatus(): ConnectionStatus {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionStatusPtr, LONG)
    return MultiplayerPeer.ConnectionStatus.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ID of this [godot.MultiplayerPeer].
   */
  public fun getUniqueId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a randomly generated integer that can be used as a network unique ID.
   */
  public fun generateUniqueId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.generateUniqueIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns true if the server can act as a relay in the current configuration (i.e. if the higher level [godot.MultiplayerAPI] should notify connected clients of other peers, and implement a relay protocol to allow communication between them).
   */
  public fun isServerRelaySupported(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isServerRelaySupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class ConnectionStatus(
    id: Long,
  ) {
    /**
     * The MultiplayerPeer is disconnected.
     */
    CONNECTION_DISCONNECTED(0),
    /**
     * The MultiplayerPeer is currently connecting to a server.
     */
    CONNECTION_CONNECTING(1),
    /**
     * This MultiplayerPeer is connected.
     */
    CONNECTION_CONNECTED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TransferMode(
    id: Long,
  ) {
    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets may arrive in any order. Potentially faster than [TRANSFER_MODE_UNRELIABLE_ORDERED]. Use for non-critical data, and always consider whether the order matters.
     */
    TRANSFER_MODE_UNRELIABLE(0),
    /**
     * Packets are not acknowledged, no resend attempts are made for lost packets. Packets are received in the order they were sent in. Potentially faster than [TRANSFER_MODE_RELIABLE]. Use for non-critical data or data that would be outdated if received late due to resend attempt(s) anyway, for example movement and positional data.
     */
    TRANSFER_MODE_UNRELIABLE_ORDERED(1),
    /**
     * Packets must be received and resend attempts should be made until the packets are acknowledged. Packets must be received in the order they were sent in. Most reliable transfer mode, but potentially the slowest due to the overhead. Use for critical data that must be transmitted and arrive in order, for example an ability being triggered or a chat message. Consider carefully if the information really is critical, and use sparingly.
     */
    TRANSFER_MODE_RELIABLE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Packets are sent to all connected peers.
     */
    public final const val TARGET_PEER_BROADCAST: Long = 0

    /**
     * Packets are sent to the remote peer acting as server.
     */
    public final const val TARGET_PEER_SERVER: Long = 1
  }

  internal object MethodBindings {
    public val setTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_transfer_channel")

    public val getTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_transfer_channel")

    public val setTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_transfer_mode")

    public val getTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_transfer_mode")

    public val setTargetPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_target_peer")

    public val getPacketPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_peer")

    public val getPacketChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_channel")

    public val getPacketModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_packet_mode")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeer", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeer", "close")

    public val disconnectPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "disconnect_peer")

    public val getConnectionStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_connection_status")

    public val getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "get_unique_id")

    public val generateUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "generate_unique_id")

    public val setRefuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "set_refuse_new_connections")

    public val isRefusingNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "is_refusing_new_connections")

    public val isServerRelaySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeer", "is_server_relay_supported")
  }
}
