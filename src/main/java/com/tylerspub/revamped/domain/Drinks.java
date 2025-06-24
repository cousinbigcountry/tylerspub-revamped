package com.tylerspub.revamped.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("4")
public class Drinks extends Product{
}
