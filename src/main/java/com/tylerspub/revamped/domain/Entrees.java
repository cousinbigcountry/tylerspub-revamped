package com.tylerspub.revamped.domain;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("5")
public class Entrees extends Product{
}
