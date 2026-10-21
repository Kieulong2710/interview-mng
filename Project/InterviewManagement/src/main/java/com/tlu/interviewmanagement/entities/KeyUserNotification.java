package com.tlu.interviewmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KeyUserNotification implements Serializable {
    private Users user;
    private Notification notification;
}
