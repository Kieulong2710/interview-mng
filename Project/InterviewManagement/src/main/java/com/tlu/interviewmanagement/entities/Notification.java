package com.tlu.interviewmanagement.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nationalized
    private String comment;
    private String link;
    private boolean checked;

    @OneToMany(mappedBy = "notification", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<UserNotification> userNotifications;
}
