extends "res://addons/gut/test.gd"


func test_packed_byte_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_byte_array.size(), 0, "PackedByteArray should be empty")
	invocation_script.add_byte_to_packed_array(2)
	assert_eq(invocation_script.packed_byte_array.size(), 1, "PackedByteArray have one element")
	invocation_script.add_byte_array_to_packed_array(PackedByteArray([2, 3]))
	assert_eq(invocation_script.packed_byte_array.size(), 3, "PackedByteArray have 3 elements")
	invocation_script.delete_byte_from_packed_array(0)
	assert_eq(invocation_script.packed_byte_array.size(), 2, "PackedByteArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_byte_packed_array(0)
	assert_eq(invocation_script.packed_byte_array.size(), 0, "PackedByteArray was emptied by resize(0)")
	invocation_script.resize_byte_packed_array(3)
	invocation_script.set_byte_in_packed_array(0, 1)
	invocation_script.set_byte_in_packed_array(1, 2)
	invocation_script.set_byte_in_packed_array(2, 3)
	assert_eq(invocation_script.packed_byte_array.size(), 3, "PackedByteArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_byte_from_packed_array(0), 1, "First element of PackedByteArray after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_byte_from_packed_array(1), 2, "Second element of PackedByteArray after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_byte_from_packed_array(2), 3, "Third element of PackedByteArray after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_packed_color_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_color_array.size(), 0, "PackedColorArray should be empty")
	invocation_script.add_color_to_packed_array(Color())
	assert_eq(invocation_script.packed_color_array.size(), 1, "PackedColorArray have one element")
	assert_eq(invocation_script.get_color_from_packed_array(0), Color(), "First element of PackedColorArray should be default color.")
	invocation_script.add_color_array_to_packed_array(PackedColorArray([Color(1, 1, 1), Color(1, 2, 3)]))
	assert_eq(invocation_script.packed_color_array.size(), 3, "PackedColorArray have 3 elements")
	assert_eq(invocation_script.get_color_from_packed_array(1), Color(1, 1, 1), "Second element of PackedColorArray should be Color(1, 1, 1).")
	assert_eq(invocation_script.get_color_from_packed_array(2), Color(1, 2, 3), "Second element of PackedColorArray should be Color(1, 2, 3).")
	invocation_script.delete_color_from_packed_array(0)
	assert_eq(invocation_script.packed_color_array.size(), 2, "PackedColorArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_color_packed_array(0)
	assert_eq(invocation_script.packed_color_array.size(), 0, "PackedColorArray was emptied by resize(0)")
	invocation_script.resize_color_packed_array(3)
	invocation_script.set_color_in_packed_array(0, Color(1, 1, 9))
	invocation_script.set_color_in_packed_array(1, Color(2, 2, 9))
	invocation_script.set_color_in_packed_array(2, Color(3, 3, 9))
	assert_eq(invocation_script.packed_color_array.size(), 3, "PackedColorArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_color_from_packed_array(0), Color(1, 1, 9), "First element of PackedColorArray after resize(3) and 3x set(...) should be Color(1, 1, 9).")
	assert_eq(invocation_script.get_color_from_packed_array(1), Color(2, 2, 9), "Second element of PackedColorArray after resize(3) and 3x set(...) should be Color(2, 2, 9).")
	assert_eq(invocation_script.get_color_from_packed_array(2), Color(3, 3, 9), "Third element of PackedColorArray after resize(3) and 3x set(...) should be Color(3, 3, 9).")

	invocation_script.free()

func test_packed_int_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_int32_array.size(), 0, "PackedInt32Array should be empty")
	invocation_script.add_int_to_packed_array(2)
	assert_eq(invocation_script.packed_int32_array.size(), 1, "PackedInt32Array have one element")
	assert_eq(invocation_script.get_int_from_packed_array(0), 2, "First element of PackedInt32Array should be 2.")
	invocation_script.add_int_array_to_packed_array(PackedInt32Array([2, 3]))
	assert_eq(invocation_script.packed_int32_array.size(), 3, "PackedInt32Array have 3 elements")
	assert_eq(invocation_script.get_int_from_packed_array(1), 2, "Second element of PackedInt32Array should be 2.")
	assert_eq(invocation_script.get_int_from_packed_array(2), 3, "Second element of PackedInt32Array should be 3.")
	invocation_script.delete_int_from_packed_array(0)
	assert_eq(invocation_script.packed_int32_array.size(), 2, "PackedInt32Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_int_packed_array(0)
	assert_eq(invocation_script.packed_int32_array.size(), 0, "PackedInt32Array was emptied by resize(0)")
	invocation_script.resize_int_packed_array(3)
	invocation_script.set_int_in_packed_array(0, 1)
	invocation_script.set_int_in_packed_array(1, 2)
	invocation_script.set_int_in_packed_array(2, 3)
	assert_eq(invocation_script.packed_int32_array.size(), 3, "PackedInt32Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_int_from_packed_array(0), 1, "First element of PackedInt32Array after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_int_from_packed_array(1), 2, "Second element of PackedInt32Array after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_int_from_packed_array(2), 3, "Third element of PackedInt32Array after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_packed_real_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_float64_array.size(), 0, "PackedFloat32Array should be empty")
	invocation_script.add_real_to_packed_array(2.0)
	assert_eq(invocation_script.packed_float64_array.size(), 1, "PackedFloat32Array have one element")
	assert_eq(invocation_script.get_real_from_packed_array(0), 2.0, "First element of PackedFloat32Array should be 2.0.")
	invocation_script.add_real_array_to_packed_array(PackedFloat64Array([2.0, 3.0]))
	assert_eq(invocation_script.packed_float64_array.size(), 3, "PackedFloat32Array have 3 elements")
	assert_eq(invocation_script.get_real_from_packed_array(1), 2.0, "Second element of PackedFloat32Array should be 2.0.")
	assert_eq(invocation_script.get_real_from_packed_array(2), 3.0, "Second element of PackedFloat32Array should be 3.0.")
	invocation_script.delete_real_from_packed_array(0)
	assert_eq(invocation_script.packed_float64_array.size(), 2, "PackedFloat32Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_real_packed_array(0)
	assert_eq(invocation_script.packed_float64_array.size(), 0, "PackedFloat32Array was emptied by resize(0)")
	invocation_script.resize_real_packed_array(3)
	invocation_script.set_real_in_packed_array(0, 1.0)
	invocation_script.set_real_in_packed_array(1, 2.0)
	invocation_script.set_real_in_packed_array(2, 3.0)
	assert_eq(invocation_script.packed_float64_array.size(), 3, "PackedFloat32Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_real_from_packed_array(0), 1.0, "First element of PackedFloat32Array after resize(3) and 3x set(...) should be 1.0.")
	assert_eq(invocation_script.get_real_from_packed_array(1), 2.0, "Second element of PackedFloat32Array after resize(3) and 3x set(...) should be 2.0.")
	assert_eq(invocation_script.get_real_from_packed_array(2), 3.0, "Third element of PackedFloat32Array after resize(3) and 3x set(...) should be 3.0.")

	invocation_script.free()

func test_packed_string_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_string_array.size(), 0, "PackedStringArray should be empty")
	invocation_script.add_string_to_packed_array("2")
	assert_eq(invocation_script.packed_string_array.size(), 1, "PackedStringArray have one element")
	assert_eq(invocation_script.get_string_from_packed_array(0), "2", "First element of PackedStringArray should be 2.")
	invocation_script.add_string_array_to_packed_array(PackedStringArray(["2", "3"]))
	assert_eq(invocation_script.packed_string_array.size(), 3, "PackedStringArray have 3 elements")
	assert_eq(invocation_script.get_string_from_packed_array(1), "2", "Second element of PackedStringArray should be 2.")
	assert_eq(invocation_script.get_string_from_packed_array(2), "3", "Second element of PackedStringArray should be 3.")
	invocation_script.delete_string_from_packed_array(0)
	assert_eq(invocation_script.packed_string_array.size(), 2, "PackedStringArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_string_packed_array(0)
	assert_eq(invocation_script.packed_string_array.size(), 0, "PackedStringArray was emptied by resize(0)")
	invocation_script.resize_string_packed_array(3)
	invocation_script.set_string_in_packed_array(0, "1")
	invocation_script.set_string_in_packed_array(1, "2")
	invocation_script.set_string_in_packed_array(2, "3")
	assert_eq(invocation_script.packed_string_array.size(), 3, "PackedStringArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_string_from_packed_array(0), "1", "First element of PackedStringArray after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_string_from_packed_array(1), "2", "Second element of PackedStringArray after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_string_from_packed_array(2), "3", "Third element of PackedStringArray after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_packed_vector2_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_vector2_array.size(), 0, "PackedVector2Array should be empty")
	invocation_script.add_vector2_to_packed_array(Vector2(2, 1))
	assert_eq(invocation_script.packed_vector2_array.size(), 1, "PackedVector2Array have one element")
	assert_eq(invocation_script.get_vector2_from_packed_array(0), Vector2(2, 1), "First element of PackedVector2Array should be Vector2(2, 1).")
	invocation_script.add_vector2_array_to_packed_array(PackedVector2Array([Vector2(2, 2), Vector2(3, 1)]))
	assert_eq(invocation_script.packed_vector2_array.size(), 3, "PackedVector2Array have 3 elements")
	assert_eq(invocation_script.get_vector2_from_packed_array(1), Vector2(2, 2), "Second element of PackedVector2Array should be Vector2(2, 2).")
	assert_eq(invocation_script.get_vector2_from_packed_array(2), Vector2(3, 1), "Second element of PackedVector2Array should be Vector2(3, 1).")
	invocation_script.delete_vector2_from_packed_array(0)
	assert_eq(invocation_script.packed_vector2_array.size(), 2, "PackedVector2Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_vector2_packed_array(0)
	assert_eq(invocation_script.packed_vector2_array.size(), 0, "PackedVector2Array was emptied by resize(0)")
	invocation_script.resize_vector2_packed_array(3)
	invocation_script.set_vector2_in_packed_array(0, Vector2(1, 1))
	invocation_script.set_vector2_in_packed_array(1, Vector2(2, 2))
	invocation_script.set_vector2_in_packed_array(2, Vector2(3, 3))
	assert_eq(invocation_script.packed_vector2_array.size(), 3, "PackedVector2Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_vector2_from_packed_array(0), Vector2(1, 1), "First element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(1, 1).")
	assert_eq(invocation_script.get_vector2_from_packed_array(1), Vector2(2, 2), "Second element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(2, 2).")
	assert_eq(invocation_script.get_vector2_from_packed_array(2), Vector2(3, 3), "Third element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(3, 3).")

	invocation_script.free()

func test_packed_vector3_array_add_delete() -> void:
	var invocation_script: Object = Invocation.new()
	assert_eq(invocation_script.packed_vector3_array.size(), 0, "PackedVector3Array should be empty")
	invocation_script.add_vector3_to_packed_array(Vector3(2, 1, 1))
	assert_eq(invocation_script.packed_vector3_array.size(), 1, "PackedVector3Array have one element")
	assert_eq(invocation_script.get_vector3_from_packed_array(0), Vector3(2, 1, 1), "First element of PackedVector3Array should be Vector3(2, 1).")
	invocation_script.add_vector3_array_to_packed_array(PackedVector3Array([Vector3(2, 2, 1), Vector3(3, 1, 1)]))
	assert_eq(invocation_script.packed_vector3_array.size(), 3, "PackedVector3Array have 3 elements")
	assert_eq(invocation_script.get_vector3_from_packed_array(1), Vector3(2, 2, 1), "Second element of PackedVector3Array should be Vector3(2, 2).")
	assert_eq(invocation_script.get_vector3_from_packed_array(2), Vector3(3, 1, 1), "Second element of PackedVector3Array should be Vector3(3, 1).")
	invocation_script.delete_vector3_from_packed_array(0)
	assert_eq(invocation_script.packed_vector3_array.size(), 2, "PackedVector3Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_vector3_packed_array(0)
	assert_eq(invocation_script.packed_vector3_array.size(), 0, "PackedVector3Array was emptied by resize(0)")
	invocation_script.resize_vector3_packed_array(3)
	invocation_script.set_vector3_in_packed_array(0, Vector3(1, 1, 9))
	invocation_script.set_vector3_in_packed_array(1, Vector3(2, 2, 9))
	invocation_script.set_vector3_in_packed_array(2, Vector3(3, 3, 9))
	assert_eq(invocation_script.packed_vector3_array.size(), 3, "PackedVector3Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_vector3_from_packed_array(0), Vector3(1, 1, 9), "First element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(1, 1, 9).")
	assert_eq(invocation_script.get_vector3_from_packed_array(1), Vector3(2, 2, 9), "Second element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(2, 2, 9).")
	assert_eq(invocation_script.get_vector3_from_packed_array(2), Vector3(3, 3, 9), "Third element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(3, 3, 9).")

	invocation_script.free()

func test_packed_byte_array_string_conversion() -> void:
	var invocation_script = Invocation.new()
	invocation_script.read_string_from_byte_array()
	assert_eq(invocation_script.test_string, invocation_script.ascii_string, "The ascii String read from the packed should be equal to the test String")
	assert_eq(invocation_script.test_string, invocation_script.utf8_string, "The utf8 String read from the packed should be equal to the test String")
	invocation_script.free()

func test_packed_byte_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_byte_array()
	assert_eq(packed[0], 0, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[1], 1, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[2], 2, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[3], 4, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[4], 8, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[5], 16, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[6], 32, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[7], 64, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")
	assert_eq(packed[8], 127, "The Godot PackedArray value should match the values in the original Kotlin ByteArray")

	assert_eq(script.get_byte_array_value(packed, 0), 0, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 1), 1, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 2), 2, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 3), 4, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 4), 8, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 5), 16, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 6), 32, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 7), 64, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")
	assert_eq(script.get_byte_array_value(packed, 8), 127, "The original Godot PackedArray value should match the values in the Kotlin ByteArray")

	script.free()

func test_packed_int_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_int_array()
	assert_eq(packed[0], 0, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[1], 1, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[2], 2, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[3], 4, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[4], 8, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[5], 16, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[6], 32, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[7], 64, "The Godot PackedArray value should match the values in the original Kotlin IntArray")
	assert_eq(packed[8], 127, "The Godot PackedArray value should match the values in the original Kotlin IntArray")

	assert_eq(script.get_int_array_value(packed, 0), 0, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 1), 1, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 2), 2, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 3), 4, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 4), 8, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 5), 16, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 6), 32, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 7), 64, "The original Godot PackedArray value should match the values in the Kotlin IntArray")
	assert_eq(script.get_int_array_value(packed, 8), 127, "The original Godot PackedArray value should match the values in the Kotlin IntArray")

	script.free()

func test_packed_long_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_long_array()
	assert_eq(packed[0], 0, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[1], 1, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[2], 2, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[3], 4, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[4], 8, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[5], 16, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[6], 32, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[7], 64, "The Godot PackedArray value should match the values in the original Kotlin LongArray")
	assert_eq(packed[8], 127, "The Godot PackedArray value should match the values in the original Kotlin LongArray")

	assert_eq(script.get_long_array_value(packed, 0), 0, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 1), 1, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 2), 2, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 3), 4, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 4), 8, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 5), 16, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 6), 32, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 7), 64, "The original Godot PackedArray value should match the values in the Kotlin LongArray")
	assert_eq(script.get_long_array_value(packed, 8), 127, "The original Godot PackedArray value should match the values in the Kotlin LongArray")

	script.free()

func test_packed_float_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_float_array()
	assert_eq(packed[0], 0.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[1], 1.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[2], 2.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[3], 4.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[4], 8.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[5], 16.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[6], 32.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[7], 64.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")
	assert_eq(packed[8], 127.0, "The Godot PackedArray value should match the values in the original Kotlin FloatArray")

	assert_eq(script.get_float_array_value(packed, 0), 0.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 1), 1.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 2), 2.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 3), 4.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 4), 8.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 5), 16.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 6), 32.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 7), 64.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")
	assert_eq(script.get_float_array_value(packed, 8), 127.0, "The original Godot PackedArray value should match the values in the Kotlin FloatArray")

	script.free()

func test_packed_double_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_double_array()
	assert_eq(packed[0], 0.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[1], 1.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[2], 2.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[3], 4.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[4], 8.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[5], 16.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[6], 32.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[7], 64.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")
	assert_eq(packed[8], 127.0, "The Godot PackedArray value should match the values in the original Kotlin DoubleArray")

	assert_eq(script.get_double_array_value(packed, 0), 0.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 1), 1.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 2), 2.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 3), 4.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 4), 8.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 5), 16.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 6), 32.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 7), 64.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")
	assert_eq(script.get_double_array_value(packed, 8), 127.0, "The original Godot PackedArray value should match the values in the Kotlin DoubleArray")

	script.free()

func test_packed_vector2_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_vector2_array()

	assert_eq(packed[0], Vector2(0.0, 1.0), "The Godot PackedArray value should match the values in the original Kotlin Vector2")
	assert_eq(packed[1], Vector2(2.0, 3.0), "The Godot PackedArray value should match the values in the original Kotlin Vector2")
	assert_eq(packed[2], Vector2(4.0, 5.0), "The Godot PackedArray value should match the values in the original Kotlin Vector2")
	assert_eq(packed[3], Vector2(1024.0, 2048.0), "The Godot PackedArray value should match the values in the original Kotlin Vector2")

	assert_eq(script.get_vector2_array_value(packed, 0), Vector2(0.0, 1.0), "The original Godot PackedArray value should match the values in the Kotlin Vector2")
	assert_eq(script.get_vector2_array_value(packed, 1), Vector2(2.0, 3.0), "The original Godot PackedArray value should match the values in the Kotlin Vector2")
	assert_eq(script.get_vector2_array_value(packed, 2), Vector2(4.0, 5.0), "The original Godot PackedArray value should match the values in the Kotlin Vector2")
	assert_eq(script.get_vector2_array_value(packed, 3), Vector2(1024.0, 2048.0), "The original Godot PackedArray value should match the values in the Kotlin Vector2")

	script.free()

func test_packed_vector3_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_vector3_array()

	assert_eq(packed[0], Vector3(0.0, 1.0, 2.0), "The Godot PackedArray value should match the values in the original Kotlin Vector3")
	assert_eq(packed[1], Vector3(3.0, 4.0, 5.0), "The Godot PackedArray value should match the values in the original Kotlin Vector3")
	assert_eq(packed[2], Vector3(6.0, 7.0, 8.0), "The Godot PackedArray value should match the values in the original Kotlin Vector3")
	assert_eq(packed[3], Vector3(1024.0, 2048.0, 4096.0), "The Godot PackedArray value should match the values in the original Kotlin Vector3")

	assert_eq(script.get_vector3_array_value(packed, 0), Vector3(0.0, 1.0, 2.0), "The original Godot PackedArray value should match the values in the Kotlin Vector3")
	assert_eq(script.get_vector3_array_value(packed, 1), Vector3(3.0, 4.0, 5.0), "The original Godot PackedArray value should match the values in the Kotlin Vector3")
	assert_eq(script.get_vector3_array_value(packed, 2), Vector3(6.0, 7.0, 8.0), "The original Godot PackedArray value should match the values in the Kotlin Vector3")
	assert_eq(script.get_vector3_array_value(packed, 3), Vector3(1024.0, 2048.0, 4096.0), "The original Godot PackedArray value should match the values in the Kotlin Vector3")

	script.free()

func test_packed_vector4_array_bulk_conversion() -> void:
	var script: Object = PackedArrayTest.new()
	var packed = script.convert_vector4_array()

	assert_eq(packed[0], Vector4(0.0, 1.0, 2.0, 3.0), "The Godot PackedArray value should match the values in the original Kotlin Vector4")
	assert_eq(packed[1], Vector4(4.0, 5.0, 6.0, 7.0), "The Godot PackedArray value should match the values in the original Kotlin Vector4")
	assert_eq(packed[2], Vector4(8.0, 9.0, 10.0, 11.0), "The Godot PackedArray value should match the values in the original Kotlin Vector4")
	assert_eq(packed[3], Vector4(1024.0, 2048.0, 4096.0, 8092.0), "The Godot PackedArray value should match the values in the original Kotlin Vector4")

	assert_eq(script.get_vector4_array_value(packed, 0), Vector4(0.0, 1.0, 2.0, 3.0), "The original Godot PackedArray value should match the values in the Kotlin Vector4")
	assert_eq(script.get_vector4_array_value(packed, 1), Vector4(4.0, 5.0, 6.0, 7.0), "The original Godot PackedArray value should match the values in the Kotlin Vector4")
	assert_eq(script.get_vector4_array_value(packed, 2), Vector4(8.0, 9.0, 10.0, 11.0), "The original Godot PackedArray value should match the values in the Kotlin Vector4")
	assert_eq(script.get_vector4_array_value(packed, 3), Vector4(1024.0, 2048.0, 4096.0, 8092.0), "The original Godot PackedArray value should match the values in the Kotlin Vector4")

	script.free()
