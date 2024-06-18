# recyclingRVM_Simulator
# Recycling RVM Simulator System README

## Overview

The Recycling RVM (Reverse Vending Machine) Simulator System is a software tool designed to emulate the functionality of a real reverse vending machine. It allows users to simulate the process of depositing recyclable materials, managing inventory, and generating reports. This simulator is useful for training, educational purposes, and testing without the need for physical hardware.

## Features

- **Material Deposit Simulation**: Users can simulate depositing different types of recyclable materials, such as bottles, cans, and plastic containers.
- **Inventory Management**: The system tracks the inventory of deposited materials and provides real-time updates.
- **User Authentication**: Users can log in and out, ensuring that only authorized personnel can access the system.
- **Reporting**: Generate detailed reports on the deposited materials, including type, quantity, and timestamps.
- **User Interface**: A user-friendly interface to facilitate easy interaction with the simulator.
- **Customizable Settings**: Configure the simulator settings to mimic different machine configurations and policies.

## System Requirements

- Operating System: Windows, macOS, or Linux
- Java Runtime Environment (JRE) 8 or higher
- 2 GB of RAM
- 100 MB of free disk space

## Installation

1. **Download the Installer**: Obtain the latest version of the RVM Simulator installer from the official website or repository.
2. **Run the Installer**: Execute the installer file and follow the on-screen instructions.
3. **Java Installation**: Ensure that Java Runtime Environment (JRE) 8 or higher is installed on your system. If not, download and install it from [Oracle's official site](https://www.oracle.com/java/technologies/javase-downloads.html).
4. **Launch the Simulator**: After installation, launch the simulator from the start menu or desktop shortcut.

## Configuration

The simulator can be configured using the `config.properties` file located in the installation directory. The following settings can be adjusted:

- `machine_id`: Unique identifier for the simulated machine.
- `max_capacity`: Maximum capacity for each type of material.
- `recyclable_items`: List of materials accepted by the machine (e.g., `bottle`, `can`, `plastic`).
- `report_path`: Directory path where reports will be saved.

## Usage

1. **Start the Simulator**: Open the simulator application.
2. **Log In**: Enter your credentials to log in.
3. **Deposit Materials**: Use the interface to simulate depositing materials into the RVM.
4. **Check Inventory**: View the current inventory status in the inventory section.
5. **Generate Reports**: Navigate to the reports section to generate and view reports on the deposited materials.
6. **Log Out**: Log out when done to ensure system security.

## Troubleshooting

- **Simulator Does Not Start**: Ensure Java is installed and the system meets the minimum requirements.
- **Login Issues**: Verify your credentials and check if the user account is active.
- **Inventory Errors**: Check the `max_capacity` setting in the `config.properties` file.
- **Report Generation Fails**: Ensure the `report_path` is correctly set and the directory is writable.

## Contributing

We welcome contributions from the community. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## License

This project is licensed under the Eclipse License. See the `LICENSE` file for details.

## Contact

For support, please contact rossymahlo@gmail.com 
---

Thank you for using the Recycling RVM Simulator System! Together, we can promote recycling and environmental sustainability.
