package com.ashwinwaikar.HibernateBasic6;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GROUP_1")
public class Group {

	private int groupId;
	private String groupName, groupTechnology;

	private Set<Member> groupMembers;

	public Group() {
	}

	public Group(int groupId, String groupName, String groupTechnology, Set<Member> groupMembers) {
		this.groupName = groupName;
		this.groupTechnology = groupTechnology;
		this.groupMembers = groupMembers;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GROUP_ID")
	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "GROUP_NAME", nullable = false, length = 100)
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "GROUP_TECHNOLOGY", nullable = false, length = 100)
	public String getGroupTechnology() {
		return groupTechnology;
	}

	public void setGroupTechnology(String groupTechnology) {
		this.groupTechnology = groupTechnology;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "gid", referencedColumnName = "GROUP_ID", nullable = false)
	public Set<Member> getGroupMembers() {
		return this.groupMembers;
	}

	public void setGroupMembers(Set<Member> groupMembers) {
		this.groupMembers = groupMembers;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", groupTechnology=" + groupTechnology
				+ ", GroupMembers=" + groupMembers + "]";
	}

}
