package networks.controller;

import networks.model.Group;
import networks.service.GroupService;

public class GroupController {

    public static void main(String[] args) {

        GroupService groupService = new GroupService();
        Group[] groups = groupService.getAll();
        for (Group elem : groups) {
            System.out.println(elem);
        }
    }
}
