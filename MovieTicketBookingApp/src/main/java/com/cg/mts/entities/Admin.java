package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
@Id
private int userId;
private String adminName;
private String adminContact;
}
