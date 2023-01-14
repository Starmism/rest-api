package me.lucko.luckperms.extension.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MetaChangeRequest(@JsonProperty(required = true) String metaKey,
                                @JsonProperty(required = true) String metaValue) { }
