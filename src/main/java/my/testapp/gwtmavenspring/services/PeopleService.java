/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.testapp.gwtmavenspring.services;

import my.testapp.gwtmavenspring.dao.PeopleDao;
import my.testapp.gwtmavenspring.models.People;

import java.util.List;

/**
 *
 * @author MikhailovAN
 */
public class PeopleService {

    private PeopleDao peoplesDao = new PeopleDao();

    public PeopleService() {
    }

    public People findPeople(int id) {
        return peoplesDao.findById(id);
    }

    public void savePeople(People people) {
        peoplesDao.save(people);
    }

    public void deletePeople(People people) {
        peoplesDao.delete(people);
    }

    public void updatePeople(People people) {
        peoplesDao.update(people);
    }

    public List<People> findAllPeoples() {
        return peoplesDao.findAll();
    }

}
