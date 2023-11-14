package com.example.ownerreplymicroservice.repository;

/*
 * Author: Keerthana
 * Date: 18/01/2023
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ownerreplymicroservice.entity.OwnerReply;

@Repository
public interface IOwnerReplyRepository extends JpaRepository<OwnerReply, Long>{

}
