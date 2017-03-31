package pr0304Barracks.core.factories;

import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		// TODO: implement for problem 3
		Class aClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
		return (Unit) aClass.newInstance();

		//throw new NotImplementedException();
	}
}
