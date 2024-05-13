package com.github.marciokleber.springintroduction.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote( String type, Value value) {
}
