package com.tylerspub.revamped.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("2")
public class Brunch extends Product{
}
