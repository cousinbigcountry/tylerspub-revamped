package com.tylerspub.revamped.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("6")
public class Sides extends Product{
}
