package com.rblm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Lease")
public class Lease implements Serializable
{
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lease_id")
    private Long lease_id;
	

}
