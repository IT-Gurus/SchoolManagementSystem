package com.school.junior.model;

import lombok.Data;

@Data
public class Permission {
    private int permissionId;
    private int permissionRoleId;
    private String permissionTitle;
    private String permissionModule;
    private String permissionDescription;

    /*
    * addPermission()
    * editPermission()
    * deletePermission()
    * searchPermission()
    * */

}
