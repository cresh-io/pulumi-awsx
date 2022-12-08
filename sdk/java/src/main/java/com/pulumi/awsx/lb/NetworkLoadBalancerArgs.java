// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.lb;

import com.pulumi.aws.ec2.Subnet;
import com.pulumi.aws.lb.inputs.LoadBalancerAccessLogsArgs;
import com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs;
import com.pulumi.awsx.lb.inputs.ListenerArgs;
import com.pulumi.awsx.lb.inputs.TargetGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkLoadBalancerArgs Empty = new NetworkLoadBalancerArgs();

    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @Import(name="accessLogs")
    private @Nullable Output<LoadBalancerAccessLogsArgs> accessLogs;

    /**
     * @return An Access Logs block. Access Logs documented below.
     * 
     */
    public Optional<Output<LoadBalancerAccessLogsArgs>> accessLogs() {
        return Optional.ofNullable(this.accessLogs);
    }

    /**
     * The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    @Import(name="customerOwnedIpv4Pool")
    private @Nullable Output<String> customerOwnedIpv4Pool;

    /**
     * @return The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    public Optional<Output<String>> customerOwnedIpv4Pool() {
        return Optional.ofNullable(this.customerOwnedIpv4Pool);
    }

    /**
     * Options creating a default target group.
     * 
     */
    @Import(name="defaultTargetGroup")
    private @Nullable TargetGroupArgs defaultTargetGroup;

    /**
     * @return Options creating a default target group.
     * 
     */
    public Optional<TargetGroupArgs> defaultTargetGroup() {
        return Optional.ofNullable(this.defaultTargetGroup);
    }

    /**
     * Port to use to connect with the target. Valid values are ports 1-65535. Defaults to 80.
     * 
     */
    @Import(name="defaultTargetGroupPort")
    private @Nullable Output<Integer> defaultTargetGroupPort;

    /**
     * @return Port to use to connect with the target. Valid values are ports 1-65535. Defaults to 80.
     * 
     */
    public Optional<Output<Integer>> defaultTargetGroupPort() {
        return Optional.ofNullable(this.defaultTargetGroupPort);
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @Import(name="desyncMitigationMode")
    private @Nullable Output<String> desyncMitigationMode;

    /**
     * @return Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    public Optional<Output<String>> desyncMitigationMode() {
        return Optional.ofNullable(this.desyncMitigationMode);
    }

    /**
     * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    @Import(name="dropInvalidHeaderFields")
    private @Nullable Output<Boolean> dropInvalidHeaderFields;

    /**
     * @return Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    public Optional<Output<Boolean>> dropInvalidHeaderFields() {
        return Optional.ofNullable(this.dropInvalidHeaderFields);
    }

    /**
     * If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    @Import(name="enableCrossZoneLoadBalancing")
    private @Nullable Output<Boolean> enableCrossZoneLoadBalancing;

    /**
     * @return If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableCrossZoneLoadBalancing() {
        return Optional.ofNullable(this.enableCrossZoneLoadBalancing);
    }

    /**
     * If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    @Import(name="enableDeletionProtection")
    private @Nullable Output<Boolean> enableDeletionProtection;

    /**
     * @return If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableDeletionProtection() {
        return Optional.ofNullable(this.enableDeletionProtection);
    }

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    @Import(name="enableWafFailOpen")
    private @Nullable Output<Boolean> enableWafFailOpen;

    /**
     * @return Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableWafFailOpen() {
        return Optional.ofNullable(this.enableWafFailOpen);
    }

    /**
     * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    @Import(name="idleTimeout")
    private @Nullable Output<Integer> idleTimeout;

    /**
     * @return The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    public Optional<Output<Integer>> idleTimeout() {
        return Optional.ofNullable(this.idleTimeout);
    }

    /**
     * If true, the LB will be internal.
     * 
     */
    @Import(name="internal")
    private @Nullable Output<Boolean> internal;

    /**
     * @return If true, the LB will be internal.
     * 
     */
    public Optional<Output<Boolean>> internal() {
        return Optional.ofNullable(this.internal);
    }

    /**
     * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    @Import(name="ipAddressType")
    private @Nullable Output<String> ipAddressType;

    /**
     * @return The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    public Optional<Output<String>> ipAddressType() {
        return Optional.ofNullable(this.ipAddressType);
    }

    /**
     * A listener to create. Only one of [listener] and [listeners] can be specified.
     * 
     */
    @Import(name="listener")
    private @Nullable ListenerArgs listener;

    /**
     * @return A listener to create. Only one of [listener] and [listeners] can be specified.
     * 
     */
    public Optional<ListenerArgs> listener() {
        return Optional.ofNullable(this.listener);
    }

    /**
     * List of listeners to create. Only one of [listener] and [listeners] can be specified.
     * 
     */
    @Import(name="listeners")
    private @Nullable List<ListenerArgs> listeners;

    /**
     * @return List of listeners to create. Only one of [listener] and [listeners] can be specified.
     * 
     */
    public Optional<List<ListenerArgs>> listeners() {
        return Optional.ofNullable(this.listeners);
    }

    /**
     * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Indicates whether the Application Load Balancer should preserve the Host header in the HTTP request and send it to the target without any change. Defaults to `false`.
     * 
     */
    @Import(name="preserveHostHeader")
    private @Nullable Output<Boolean> preserveHostHeader;

    /**
     * @return Indicates whether the Application Load Balancer should preserve the Host header in the HTTP request and send it to the target without any change. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> preserveHostHeader() {
        return Optional.ofNullable(this.preserveHostHeader);
    }

    /**
     * A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A subnet mapping block as documented below.
     * 
     */
    @Import(name="subnetMappings")
    private @Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings;

    /**
     * @return A subnet mapping block as documented below.
     * 
     */
    public Optional<Output<List<LoadBalancerSubnetMappingArgs>>> subnetMappings() {
        return Optional.ofNullable(this.subnetMappings);
    }

    /**
     * A list of subnets to attach to the LB. Only one of [subnets], [subnetIds] or [subnetMappings] can be specified
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<Subnet>> subnets;

    /**
     * @return A list of subnets to attach to the LB. Only one of [subnets], [subnetIds] or [subnetMappings] can be specified
     * 
     */
    public Optional<Output<List<Subnet>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkLoadBalancerArgs() {}

    private NetworkLoadBalancerArgs(NetworkLoadBalancerArgs $) {
        this.accessLogs = $.accessLogs;
        this.customerOwnedIpv4Pool = $.customerOwnedIpv4Pool;
        this.defaultTargetGroup = $.defaultTargetGroup;
        this.defaultTargetGroupPort = $.defaultTargetGroupPort;
        this.desyncMitigationMode = $.desyncMitigationMode;
        this.dropInvalidHeaderFields = $.dropInvalidHeaderFields;
        this.enableCrossZoneLoadBalancing = $.enableCrossZoneLoadBalancing;
        this.enableDeletionProtection = $.enableDeletionProtection;
        this.enableWafFailOpen = $.enableWafFailOpen;
        this.idleTimeout = $.idleTimeout;
        this.internal = $.internal;
        this.ipAddressType = $.ipAddressType;
        this.listener = $.listener;
        this.listeners = $.listeners;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.preserveHostHeader = $.preserveHostHeader;
        this.subnetIds = $.subnetIds;
        this.subnetMappings = $.subnetMappings;
        this.subnets = $.subnets;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkLoadBalancerArgs $;

        public Builder() {
            $ = new NetworkLoadBalancerArgs();
        }

        public Builder(NetworkLoadBalancerArgs defaults) {
            $ = new NetworkLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLogs An Access Logs block. Access Logs documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(@Nullable Output<LoadBalancerAccessLogsArgs> accessLogs) {
            $.accessLogs = accessLogs;
            return this;
        }

        /**
         * @param accessLogs An Access Logs block. Access Logs documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessLogs(LoadBalancerAccessLogsArgs accessLogs) {
            return accessLogs(Output.of(accessLogs));
        }

        /**
         * @param customerOwnedIpv4Pool The ID of the customer owned ipv4 pool to use for this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            $.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        /**
         * @param customerOwnedIpv4Pool The ID of the customer owned ipv4 pool to use for this load balancer.
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            return customerOwnedIpv4Pool(Output.of(customerOwnedIpv4Pool));
        }

        /**
         * @param defaultTargetGroup Options creating a default target group.
         * 
         * @return builder
         * 
         */
        public Builder defaultTargetGroup(@Nullable TargetGroupArgs defaultTargetGroup) {
            $.defaultTargetGroup = defaultTargetGroup;
            return this;
        }

        /**
         * @param defaultTargetGroupPort Port to use to connect with the target. Valid values are ports 1-65535. Defaults to 80.
         * 
         * @return builder
         * 
         */
        public Builder defaultTargetGroupPort(@Nullable Output<Integer> defaultTargetGroupPort) {
            $.defaultTargetGroupPort = defaultTargetGroupPort;
            return this;
        }

        /**
         * @param defaultTargetGroupPort Port to use to connect with the target. Valid values are ports 1-65535. Defaults to 80.
         * 
         * @return builder
         * 
         */
        public Builder defaultTargetGroupPort(Integer defaultTargetGroupPort) {
            return defaultTargetGroupPort(Output.of(defaultTargetGroupPort));
        }

        /**
         * @param desyncMitigationMode Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
         * 
         * @return builder
         * 
         */
        public Builder desyncMitigationMode(@Nullable Output<String> desyncMitigationMode) {
            $.desyncMitigationMode = desyncMitigationMode;
            return this;
        }

        /**
         * @param desyncMitigationMode Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
         * 
         * @return builder
         * 
         */
        public Builder desyncMitigationMode(String desyncMitigationMode) {
            return desyncMitigationMode(Output.of(desyncMitigationMode));
        }

        /**
         * @param dropInvalidHeaderFields Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
         * 
         * @return builder
         * 
         */
        public Builder dropInvalidHeaderFields(@Nullable Output<Boolean> dropInvalidHeaderFields) {
            $.dropInvalidHeaderFields = dropInvalidHeaderFields;
            return this;
        }

        /**
         * @param dropInvalidHeaderFields Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
         * 
         * @return builder
         * 
         */
        public Builder dropInvalidHeaderFields(Boolean dropInvalidHeaderFields) {
            return dropInvalidHeaderFields(Output.of(dropInvalidHeaderFields));
        }

        /**
         * @param enableCrossZoneLoadBalancing If true, cross-zone load balancing of the load balancer will be enabled.
         * This is a `network` load balancer feature. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableCrossZoneLoadBalancing(@Nullable Output<Boolean> enableCrossZoneLoadBalancing) {
            $.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
            return this;
        }

        /**
         * @param enableCrossZoneLoadBalancing If true, cross-zone load balancing of the load balancer will be enabled.
         * This is a `network` load balancer feature. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableCrossZoneLoadBalancing(Boolean enableCrossZoneLoadBalancing) {
            return enableCrossZoneLoadBalancing(Output.of(enableCrossZoneLoadBalancing));
        }

        /**
         * @param enableDeletionProtection If true, deletion of the load balancer will be disabled via
         * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableDeletionProtection(@Nullable Output<Boolean> enableDeletionProtection) {
            $.enableDeletionProtection = enableDeletionProtection;
            return this;
        }

        /**
         * @param enableDeletionProtection If true, deletion of the load balancer will be disabled via
         * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableDeletionProtection(Boolean enableDeletionProtection) {
            return enableDeletionProtection(Output.of(enableDeletionProtection));
        }

        /**
         * @param enableWafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableWafFailOpen(@Nullable Output<Boolean> enableWafFailOpen) {
            $.enableWafFailOpen = enableWafFailOpen;
            return this;
        }

        /**
         * @param enableWafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableWafFailOpen(Boolean enableWafFailOpen) {
            return enableWafFailOpen(Output.of(enableWafFailOpen));
        }

        /**
         * @param idleTimeout The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(@Nullable Output<Integer> idleTimeout) {
            $.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * @param idleTimeout The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeout(Integer idleTimeout) {
            return idleTimeout(Output.of(idleTimeout));
        }

        /**
         * @param internal If true, the LB will be internal.
         * 
         * @return builder
         * 
         */
        public Builder internal(@Nullable Output<Boolean> internal) {
            $.internal = internal;
            return this;
        }

        /**
         * @param internal If true, the LB will be internal.
         * 
         * @return builder
         * 
         */
        public Builder internal(Boolean internal) {
            return internal(Output.of(internal));
        }

        /**
         * @param ipAddressType The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
         * 
         * @return builder
         * 
         */
        public Builder ipAddressType(@Nullable Output<String> ipAddressType) {
            $.ipAddressType = ipAddressType;
            return this;
        }

        /**
         * @param ipAddressType The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
         * 
         * @return builder
         * 
         */
        public Builder ipAddressType(String ipAddressType) {
            return ipAddressType(Output.of(ipAddressType));
        }

        /**
         * @param listener A listener to create. Only one of [listener] and [listeners] can be specified.
         * 
         * @return builder
         * 
         */
        public Builder listener(@Nullable ListenerArgs listener) {
            $.listener = listener;
            return this;
        }

        /**
         * @param listeners List of listeners to create. Only one of [listener] and [listeners] can be specified.
         * 
         * @return builder
         * 
         */
        public Builder listeners(@Nullable List<ListenerArgs> listeners) {
            $.listeners = listeners;
            return this;
        }

        /**
         * @param listeners List of listeners to create. Only one of [listener] and [listeners] can be specified.
         * 
         * @return builder
         * 
         */
        public Builder listeners(ListenerArgs... listeners) {
            return listeners(List.of(listeners));
        }

        /**
         * @param name The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
         * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
         * this provider will autogenerate a name beginning with `tf-lb`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
         * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
         * this provider will autogenerate a name beginning with `tf-lb`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the Host header in the HTTP request and send it to the target without any change. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder preserveHostHeader(@Nullable Output<Boolean> preserveHostHeader) {
            $.preserveHostHeader = preserveHostHeader;
            return this;
        }

        /**
         * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the Host header in the HTTP request and send it to the target without any change. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder preserveHostHeader(Boolean preserveHostHeader) {
            return preserveHostHeader(Output.of(preserveHostHeader));
        }

        /**
         * @param subnetIds A list of subnet IDs to attach to the LB. Subnets
         * cannot be updated for Load Balancers of type `network`. Changing this value
         * for load balancers of type `network` will force a recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnet IDs to attach to the LB. Subnets
         * cannot be updated for Load Balancers of type `network`. Changing this value
         * for load balancers of type `network` will force a recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnet IDs to attach to the LB. Subnets
         * cannot be updated for Load Balancers of type `network`. Changing this value
         * for load balancers of type `network` will force a recreation of the resource.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param subnetMappings A subnet mapping block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetMappings(@Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings) {
            $.subnetMappings = subnetMappings;
            return this;
        }

        /**
         * @param subnetMappings A subnet mapping block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetMappings(List<LoadBalancerSubnetMappingArgs> subnetMappings) {
            return subnetMappings(Output.of(subnetMappings));
        }

        /**
         * @param subnetMappings A subnet mapping block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetMappings(LoadBalancerSubnetMappingArgs... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }

        /**
         * @param subnets A list of subnets to attach to the LB. Only one of [subnets], [subnetIds] or [subnetMappings] can be specified
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<Subnet>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets A list of subnets to attach to the LB. Only one of [subnets], [subnetIds] or [subnetMappings] can be specified
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<Subnet> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets A list of subnets to attach to the LB. Only one of [subnets], [subnetIds] or [subnetMappings] can be specified
         * 
         * @return builder
         * 
         */
        public Builder subnets(Subnet... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public NetworkLoadBalancerArgs build() {
            return $;
        }
    }

}
