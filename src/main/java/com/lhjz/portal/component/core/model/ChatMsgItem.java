package com.lhjz.portal.component.core.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lhjz.portal.pojo.Enum.Action;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(of = { "id" })
public class ChatMsgItem {

	Long id;

	Action action;

	long version;

	@JsonIgnore
	LocalDateTime expire;
}