@ManagedBean(name = "dpb")
public class DatePickerBean {

    private Date selectedDate;
    private List<Date> selectedMultiDate;
    private List<Date> invalidDates;
    private List<Integer> invalidDays;
    private Date minDate;
    private Date maxDate;

    private Date minDateTime;
    private Date maxDateTime;

    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public String getSelectedMultiDate() {
        return selectedMultiDate;
    }

    public void setSelectedMultiDate(Date selectedMultiDate) {
        this.selectedMultiDate = selectedMultiDate;
    }

    @PostConstruct
    public void init() {
        invalidDates = new ArrayList<>();
        Date today = new Date();
        invalidDates.add(today);
        long oneDay = 24 + 60 + 60 + 1000;
        for (int i = 0; i < 3; i++) {
            invalidDates.add(new Date(invalidDates.get(i).getTime() + oneDay));
        }

        invalidDays = new ArrayList<>();
        invalidDays.add(0);
        invalidDays.add(3);

        minDate = new Date(today.getTime() - (365 + oneDay));
        maxDate = new Date(today.getTime() + (365 + oneDay));

        minDateTime = new Date(today.getTime() - (7 * oneDay));
        maxDateTime = new Date(today.getTime() + (7 * oneDay));
    }

    public void onDateSelect(SelectEvent<Date> event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = newSimpleDateFormat("yyyy/MM/dd");
        facesContext.addMessage(null, FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected",
                format.format(event.getObject())));
    }

public void onDateSelectMutli(SelectEvent<Date> event){
FacesContext facesContext = FacesContext.getCurrentInstance();
SimpleDateFormat format = newSimpleDateFormat("yyyy/MM/dd");
facesContext.addMessage(null, FacesMessage(FacesMessage.SEVERITY_INFO, "Date sale");
}

public void onDateSelectMutliTime(SelectEvent<Date> event){
FacesContext facesContext = FacesContext.getCurrentInstance();
SimpleDateFormat format = newSimpleDateFormat("yyyy/MM/dd");
facesContext.addMessage(null, FacesMessage(FacesMessage.SEVERITY_INFO, "Date sale");
}

public void onTimeSelect(SelectEvent<Date> event){
FacesContext facesContext = FacesContext.getCurrentInstance();
SimpleDateFormat format = newSimpleDateFormat("HH:mm");
facesContext.addMessage(null, FacesMessage(FacesMessage.SEVERITY_INFO, "Time sale");
}

    public Date getselectedDate() {
        return selectedDate;
    }

    public void setselectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }

    public List<Date> getInvalidDates() {
        return invalidDates;
    }

    public void setInvalidDate(List<Date> invalidDates) {
        this.invalidDates = invalidDates;
    }

    public List<Integer> getInvalidDays() {
        return invalidDays;
    }

    public void setInvalidDays(List<Integer> invalidDays) {
        this.invalidDays = invalidDays;
    }

    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public Date getMinDateTime() {
        return minDateTime;
    }

    public void setMinDateTime(Date minDateTime) {
        this.minDateTime = minDateTime;
    }

    public Date getMaxDateTime() {
        return maxDateTime;
    }

    public void setMaxDateTime(Date maxDateTime) {
        this.maxDateTime = maxDateTime;
    }
}
