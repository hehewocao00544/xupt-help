package cn.edu.xupt.help.framework.domain;

public class TbDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dept.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dept.dept_parent
     *
     * @mbggenerated
     */
    private Long deptParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_dept.dept_name
     *
     * @mbggenerated
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dept.id
     *
     * @return the value of tb_dept.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dept.id
     *
     * @param id the value for tb_dept.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dept.dept_parent
     *
     * @return the value of tb_dept.dept_parent
     *
     * @mbggenerated
     */
    public Long getDeptParent() {
        return deptParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dept.dept_parent
     *
     * @param deptParent the value for tb_dept.dept_parent
     *
     * @mbggenerated
     */
    public void setDeptParent(Long deptParent) {
        this.deptParent = deptParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_dept.dept_name
     *
     * @return the value of tb_dept.dept_name
     *
     * @mbggenerated
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_dept.dept_name
     *
     * @param deptName the value for tb_dept.dept_name
     *
     * @mbggenerated
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}