#ifndef GODOT_JVM_JVM_RESOURCE_FORMAT_SAVER_H
#define GODOT_JVM_JVM_RESOURCE_FORMAT_SAVER_H

#include <core/io/resource_saver.h>

class JvmResourceFormatSaver : public ResourceFormatSaver {
public:
    JvmResourceFormatSaver() = default;
    JvmResourceFormatSaver(const JvmResourceFormatSaver&) = delete;
    void operator=(const JvmResourceFormatSaver&) = delete;

    void get_recognized_extensions(const Ref<Resource>& p_resource, List<String>* p_extensions) const override;
    bool recognize(const Ref<Resource>& p_resource) const override;
    Error save(const Ref<Resource>& p_resource, const String& p_path, uint32_t p_flags) override;
};

#endif// GODOT_JVM_JVM_RESOURCE_FORMAT_SAVER_H
