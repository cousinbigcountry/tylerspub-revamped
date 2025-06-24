package com.tylerspub.revamped.domain;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("3")
public class Desserts extends Product{
}
