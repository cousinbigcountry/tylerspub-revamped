package com.tylerspub.revamped.domain;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("1")
public class Appetizers extends Product{
}
