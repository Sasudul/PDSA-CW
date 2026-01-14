package com.floodnav.floodnav_backend.model;

import com.floodnav.floodnav_backend.model.Enum.Severity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clusters")
public class Cluster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double centroidLatitude;

    private Double centroidLongitude;

    private int totalPeople;

    @Enumerated(EnumType.STRING)
    private Severity maxSeverity;

    private Double distanceToRescueBase;

    private Double priorityScore;

    @OneToMany
    @JoinColumn(name = "cluster_id")
    private List<SosRequest> sosRequests;

    public Cluster() {
    }

    public Cluster(Double centroidLatitude, Double centroidLongitude,
                   int totalPeople, Severity maxSeverity,
                   Double distanceToRescueBase, Double priorityScore,
                   List<SosRequest> sosRequests) {
        this.centroidLatitude = centroidLatitude;
        this.centroidLongitude = centroidLongitude;
        this.totalPeople = totalPeople;
        this.maxSeverity = maxSeverity;
        this.distanceToRescueBase = distanceToRescueBase;
        this.priorityScore = priorityScore;
        this.sosRequests = sosRequests;
    }

    public Long getId() {
        return id;
    }

    public Double getCentroidLatitude() {
        return centroidLatitude;
    }

    public void setCentroidLatitude(Double centroidLatitude) {
        this.centroidLatitude = centroidLatitude;
    }

    public Double getCentroidLongitude() {
        return centroidLongitude;
    }

    public void setCentroidLongitude(Double centroidLongitude) {
        this.centroidLongitude = centroidLongitude;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }

    public Severity getMaxSeverity() {
        return maxSeverity;
    }

    public void setMaxSeverity(Severity maxSeverity) {
        this.maxSeverity = maxSeverity;
    }

    public Double getDistanceToRescueBase() {
        return distanceToRescueBase;
    }

    public void setDistanceToRescueBase(Double distanceToRescueBase) {
        this.distanceToRescueBase = distanceToRescueBase;
    }

    public Double getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(Double priorityScore) {
        this.priorityScore = priorityScore;
    }

    public List<SosRequest> getSosRequests() {
        return sosRequests;
    }

    public void setSosRequests(List<SosRequest> sosRequests) {
        this.sosRequests = sosRequests;
    }
}
