package com.nyash.tickettracker.api.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket {

    String id;

    String visibleId;

}
