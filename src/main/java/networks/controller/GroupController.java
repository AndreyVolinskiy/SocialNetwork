package networks.controller;

import networks.model.Group;
import networks.service.GroupService;
import networks.service.impl.GroupServiceImpl;

import java.util.List;

public class GroupController {

    public static void main(String[] args) {

        GroupService groupService = new GroupServiceImpl();

        List<Group> groups = groupService.getAll();
        for (Group elem : groups) {
            System.out.println(elem);
        }
        System.out.println("");

        List<Group> listOfGroupByName = groupService.getByNameOfGroup("BOS");
        for (Group group : listOfGroupByName) {
            System.out.println(group);
        }

    }
}
