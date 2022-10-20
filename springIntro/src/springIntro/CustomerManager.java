package springIntro;

public class CustomerManager implements ICustomerService{

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	@Override
	public void add() {
		customerDal.add();
	}

}
