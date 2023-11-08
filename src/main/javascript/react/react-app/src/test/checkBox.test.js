import {CheckBox} from "./checkBox";
import {fireEvent, render} from "@testing-library/react";

test(
    "Selecting checkbox should change value true",
    () => {
        const {getByLabelText} = render(<CheckBox />);
        const checkbox = getByLabelText(/not checked/i);
        fireEvent.click(checkbox);
        expect(checkbox.checked).toEqual(true);
    }
);