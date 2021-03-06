package com.warmer.kgmaker.dal.impl;

import com.warmer.kgmaker.dal.IKnowledgegraphRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class knowledgegraphRepository implements IKnowledgegraphRepository {
    @Autowired
    private IKnowledgegraphRepository knowledgegraphRepository;

    @Override
    public List<Map<String, Object>> getDomainList(String domainname,String createuser) {
        List<Map<String,Object>> list = knowledgegraphRepository.getDomainList(domainname,createuser);
        return list;
    }

    @Override
    public List<Map<String, Object>> getRelationshipList(Integer domainid, Integer relationtype, String shipname) {
        return null;
    }

    @Override
    public void saveDomain(Map<String, Object> map) {
        knowledgegraphRepository.saveDomain(map);
    }

    @Override
    public void updateDomain(Map<String, Object> map) {
        knowledgegraphRepository.updateDomain(map);
    }

    @Override
    public void deleteDomain(Integer id) {
        knowledgegraphRepository.deleteDomain(id);
    }

    @Override
    public List<Map<String, Object>> getDomainByName(String domainname) {
        return knowledgegraphRepository.getDomainByName(domainname);
    }

    @Override
    public List<Map<String, Object>> getDomains() {
        return knowledgegraphRepository.getDomains();
    }

    @Override
    public List<Map<String, Object>> getDomainById(Integer domainid) {
        return knowledgegraphRepository.getDomainById(domainid);
    }

    @Override
    public void saveNodeImage(List<Map<String, Object>> mapList) {
        knowledgegraphRepository.saveNodeImage(mapList);
    }

    @Override
    public void saveNodeContent(Map<String, Object> map) {
        knowledgegraphRepository.saveNodeContent(map);
    }

    @Override
    public void updateNodeContent(Map<String, Object> map) {
        knowledgegraphRepository.updateNodeContent(map);
    }

    @Override
    public List<Map<String, Object>> getNodeImageList(Integer domainid, Integer nodeid) {
        return knowledgegraphRepository.getNodeImageList(domainid,nodeid);
    }

    @Override
    public List<Map<String, Object>> getNodeContent(Integer domainid, Integer nodeid) {
        return knowledgegraphRepository.getNodeContent(domainid,nodeid);
    }

    @Override
    public void deleteNodeImage(Integer domainid, Integer nodeid) {
        knowledgegraphRepository.deleteNodeImage(domainid,nodeid);
    }

}
